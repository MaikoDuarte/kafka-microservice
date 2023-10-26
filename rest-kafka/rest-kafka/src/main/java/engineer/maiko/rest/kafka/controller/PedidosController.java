package engineer.maiko.rest.kafka.controller;

import engineer.maiko.rest.kafka.data.PedidoData;
import engineer.maiko.rest.kafka.services.RegistroEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PedidosController {

    private final RegistroEventoService eventoService;

    @PostMapping(path = "/api/salva-pedido")
    public ResponseEntity<String> SalvarPedido(@RequestBody PedidoData pedido) {
        eventoService.adicionarEvento("SalvarPedido", pedido);


        return ResponseEntity.ok("Sucesso");
    }
}
