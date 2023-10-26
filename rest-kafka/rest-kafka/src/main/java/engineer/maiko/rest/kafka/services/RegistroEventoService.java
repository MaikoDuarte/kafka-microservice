package engineer.maiko.rest.kafka.services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistroEventoService {

    private final KafkaTemplate<Object, Object> template;

    public <T> void adicionarEvento(String topico, T dados) {
        template.send(topico, dados);

    }



}
