package epv.apirest.main;

import epv.apirest.main.servicio.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppCrudApplication implements CommandLineRunner {
    @Autowired
    ClienteService clienteService;
    public static void main(String[] args) {
        SpringApplication.run(AppCrudApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /* Cliente cl = new Cliente();
        cl.setBarrio("Villanueva");
        cl.setCiudad("Cali");
        cl.setDireccion("Calle 32");
        cl.setDocumento("56526565");
        cl.setEmail("epro82@hotmail.com");
        cl.setNombre("Carlos Valderrama");
        clienteService.crear(cl);
        cl.setBarrio("san pedro");
        cl.setCiudad("Cali");
        cl.setDireccion("Calle 56");
        cl.setDocumento("5652656565");
        cl.setEmail("pepe82@hotmail.com");
        cl.setNombre("Pedro Marquez");
        clienteService.crear(cl);
        cl.setBarrio("san pedro");
        cl.setCiudad("Cali");
        cl.setDireccion("Calle 56");
        cl.setDocumento("5652656565");
        cl.setEmail("pepe82@hotmail.com");
        cl.setNombre("Pedro Marquez");
        clienteService.crear(cl);*/
    }
}
