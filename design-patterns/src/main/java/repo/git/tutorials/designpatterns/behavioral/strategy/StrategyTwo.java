package repo.git.tutorials.designpatterns.behavioral.strategy;

import org.springframework.stereotype.Component;

@Component
public class StrategyTwo implements Strategy{
    @Override
    public void doOperation() {
        System.out.println("Implementing strategy Two");
    }

    @Override
    public StrategyNameEnum getStrategy() {
        return StrategyNameEnum.StrategyTwo;
    }
}
