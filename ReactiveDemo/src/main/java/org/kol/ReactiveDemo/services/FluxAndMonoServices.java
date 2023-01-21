package org.kol.ReactiveDemo.services;

import org.springframework.ui.ModelMap;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class FluxAndMonoServices {

    // creating flux
    public Flux<String> employeeFlux() {
        return Flux.fromIterable(List.of("Mark", "Paul", "Watson")).log();
    }

    public Mono<String> employeeMono() {
        return Mono.just("John").log();
    }

    public Flux<String> employeeFluxMap() {
        return Flux.fromIterable(List.of("Mark", "Paul", "Watson"))
                .map(String::toUpperCase)
                .log();
    }

    public Flux<String> employeeFluxFilter(int number) {
        return Flux.fromIterable(List.of("Mark", "Paul", "Watson"))
                .filter(emp -> emp.length() > number)
                .log();
    }

    public Flux<String> employeeFluxFilterAndMap(int number) {
        return Flux.fromIterable(List.of("Mark", "Paul", "Watson"))
                .filter(emp -> emp.length() > number)
                .map(String::toUpperCase)
                .log();
    }

    public static void main(String[] args) {
        FluxAndMonoServices fluxAndMonoServices = new FluxAndMonoServices();

//        fluxAndMonoServices.employeeFlux()
//                .subscribe(emp ->
//                        System.out.println(emp));

//        fluxAndMonoServices.employeeMono()
//                .subscribe(emp ->
//                        System.out.println(emp));

//        fluxAndMonoServices.employeeFluxMap()
//                .subscribe(emp ->
//                        System.out.println(emp));

//        fluxAndMonoServices.employeeFluxFilter(4)
//                .subscribe(emp ->
//                        System.out.println(emp));

        fluxAndMonoServices.employeeFluxFilterAndMap(4)
                .subscribe(emp ->
                        System.out.println(emp));
    }
}
