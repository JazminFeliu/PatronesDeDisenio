package com.example.patronesdedisenio;

import com.example.patronesdedisenio.Proxy.Cliente;
import com.example.patronesdedisenio.Proxy.ProxySoporteTecnico;
import com.example.patronesdedisenio.Proxy.SoporteTecnico;
import com.example.patronesdedisenio.Singleton.Personaje;
import com.example.patronesdedisenio.builder.Usuario;
import com.example.patronesdedisenio.builder.UsuarioBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatronesDeDisenioApplication {

    public static void main(String[] args) {
       // SpringApplication.run(PatronesDeDisenioApplication.class, args);


        pruebasSingleton();
        pruebasBuilder();
        pruebasConProxy();

    }

    private static void pruebasSingleton() {
        Personaje mario = Personaje.getPersonaje();
        mario.setNombre("mario");
        System.out.println("Nombre: "+mario.getNombre());
        mario.sumarPuntos(105);
        System.out.println("Puntaje final: "+mario.getPuntaje());
        Personaje otroMas = Personaje.getPersonaje();
        System.out.println("Nombre del otro: "+otroMas.getNombre());
    }

    private static void pruebasBuilder(){

        Usuario jaz = new UsuarioBuilder()
                .setNombre("Jaz")
                .setApellido("Feliu")
                .setRole("admin")
                .build();

        Usuario joni = new UsuarioBuilder()
                .setNombre("Joni")
                .setApellido("Sotis")
                .setRole("cliente")
                .build();

        Usuario sonia = new UsuarioBuilder(jaz)
                .setApellido("otro apellido")
                .setRole("otro rol")
                .build();

        System.out.println(jaz.informarLoQuePuedHacer());
        System.out.println(joni.informarLoQuePuedHacer());
    }

    private static void pruebasConProxy(){
        Cliente cliente1 = new Cliente("juli", "VIP");
        Cliente cliente2 = new Cliente("sofi", "Regular");

        SoporteTecnico soporteTecnico1 = new ProxySoporteTecnico(cliente1.getCategoria());
        System.out.println(soporteTecnico1.obtenerSoporte());
        SoporteTecnico soporteTecnico2 = new ProxySoporteTecnico(cliente2.getCategoria());
        System.out.println(soporteTecnico2.obtenerSoporte());
    }
}
