package repo.git.tutorials.designpatterns.examples.vending_machine;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Response {

    private Product product;
    private double change;
}
