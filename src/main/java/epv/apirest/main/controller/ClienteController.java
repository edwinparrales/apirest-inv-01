package epv.apirest.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import epv.apirest.main.modelo.Cliente;
import epv.apirest.main.servicio.IClienteService;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping
public class ClienteController {
	@Autowired
	IClienteService ics;
	
    @GetMapping("app/cliente")
    public ModelAndView saludo(Model model,@ModelAttribute("cliente") Cliente cliente){
        ModelAndView vista = new ModelAndView();
        
        List<Cliente>clientes = ics.listar();
        
        model.addAttribute("clientes",clientes);
        model.addAttribute("cliente",cliente);
        vista.setViewName("cliente");



        return vista;
    }
    
    
    @GetMapping("app/cliente-formulario")
    public String clienteFormulario(Model model,@ModelAttribute("cliente") Cliente cliente) {
    	
    	model.addAttribute("cliente",cliente);
    	
    	return "nuevoCliente";
    }
    
    
    @GetMapping("app/cliente-formulario/{cliente}")
    public String clienteFormularioEditar(Model model,@PathVariable("cliente") Cliente cliente) {
    	//System.out.println("cliente"+cliente.toString());
    	
    	model.addAttribute("cliente",cliente);
    	
    	return "nuevoCliente";
    }
    
    
    @PostMapping("app/cliente/crear")
    public String crear(@ModelAttribute("cliente") Cliente cliente) {
    	//System.out.println("One"+cliente);
    	ics.crear(cliente);
    	return "redirect:/app/cliente";
    }
    
    
    
    @GetMapping("app/cliente/eliminar/{id}")
    public String eliminar(Model model,@PathVariable(name = "id") Long id){
    	try {
    		  ics.eliminar(id);
    	}catch (Exception e) {
           model.addAttribute("errorMsj","Error al eliminar");
    	}
      
        return "redirect:/app/cliente";
    }
    
    
    
    
    
    
    
    
}
