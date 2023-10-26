package engineer.maiko.rest.kafka.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoData {
    private String codigo;
    private String NomeProduto;
    private BigDecimal valor;



}
