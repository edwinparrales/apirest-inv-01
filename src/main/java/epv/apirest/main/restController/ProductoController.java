package epv.apirest.main.restController;

import ch.qos.logback.core.net.SyslogOutputStream;
import epv.apirest.main.modelo.Producto;
import epv.apirest.main.servicio.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/producto/")
@CrossOrigin(origins = "*")
public class ProductoController {
    @Autowired
    IProductoService productoService;
    @GetMapping("listar")
    public ResponseEntity<List<Producto>> listar(){
     return new ResponseEntity<>(productoService.listar(), HttpStatus.OK);
    }
    @PostMapping ("crear")
    public ResponseEntity<Producto> guardar(@Valid @RequestBody Producto producto){
        return new ResponseEntity<>(productoService.crear(producto), HttpStatus.CREATED);
    }

    //Metodo para buscar un producto por codigo

    @GetMapping(value = "buscar/{codigo}")
    public ResponseEntity<Producto> buscarCodigo(@PathVariable(name = "codigo")String codigo){
        return new ResponseEntity<>(productoService.buscarCodigo(codigo),HttpStatus.OK);
    }
    //Metodo para eliminar un producto
    @DeleteMapping(value = "eliminar/{id}")
    public ResponseEntity eliminar(@PathVariable(name = "id") Long id){
        try {
            productoService.eliminar(id);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity(HttpStatus.CONFLICT);
        }

    }
    @CrossOrigin(origins = {"*"})
    @PutMapping(value = "actualizar/{id}")
    public ResponseEntity<Producto> actualizar(@PathVariable(name = "id")Long id,@Valid @RequestBody Producto producto){
     Producto productOld=productoService.buscarId(id).get();
        System.out.println(productOld.toString());
        if(productOld.getId()>0){
            productOld.setCodigo(producto.getCodigo());
            productOld.setDescripcion(producto.getDescripcion());
            productOld.setCantidad(producto.getCantidad());
            productOld.setCapacidad(producto.getCapacidad());
            productOld.setMarca(producto.getMarca());
            productOld.setModelo(producto.getModelo());
            productOld.setCategoria(producto.getCategoria());
            productOld.setValor(producto.getValor());
            return new ResponseEntity<>(productoService.crear(productOld),HttpStatus.ACCEPTED);
        }else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

    }

    //Buscar producto por id
    @GetMapping(value = "buscarid/{id}")
    public ResponseEntity<Producto> buscarId(@PathVariable(name = "id") Long id){
       return  new ResponseEntity<>(productoService.buscarId(id).get(),HttpStatus.OK);
    }

}
