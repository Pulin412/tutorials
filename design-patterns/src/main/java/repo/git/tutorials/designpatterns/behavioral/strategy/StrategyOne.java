package repo.git.tutorials.designpatterns.behavioral.strategy;

import org.springframework.stereotype.Component;

@Component
public class StrategyOne implements Strategy{
    @Override
    public void doOperation() {
        System.out.println("Implementing strategy One");
    }

    @Override
    public StrategyNameEnum getStrategy() {
        return StrategyNameEnum.StrategyOne;
    }
}
