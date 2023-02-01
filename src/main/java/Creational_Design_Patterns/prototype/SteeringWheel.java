package Creational_Design_Patterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName =  "of")
public class SteeringWheel implements Cloneable {

    private double diameter;
    public SteeringWheel deepCopy() {
        var newSteeringWheel = new SteeringWheel();
        newSteeringWheel.diameter = this.diameter;
        return newSteeringWheel;
    }

    @Override
    protected SteeringWheel clone() throws CloneNotSupportedException {
        return (SteeringWheel) super.clone();
    }
}


