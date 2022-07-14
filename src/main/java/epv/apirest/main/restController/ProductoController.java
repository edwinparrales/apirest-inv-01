package epv.apirest.main.controller;

import epv.apirest.main.modelo.Producto;
import epv.apirest.main.servicio.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/producto/")
public class ProductoController {
    @Autowired
    IProductoService productoService;
    @GetMapping("listar")
    public ResponseEntity<List<Producto>> listar(){
     return new ResponseEntity<>(productoService.listar(), HttpStatus.OK);
    }
    @PostMapping ("crear")
    public ResponseEntity<Producto> guardar(@RequestBody Producto producto){
        return new ResponseEntity<>(productoService.crear(producto), HttpStatus.CREATED);
    }
}
