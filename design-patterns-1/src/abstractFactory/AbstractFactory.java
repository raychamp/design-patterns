package abstractFactory;

import factoryPattern.Shape;

public abstract class AbstractFactory {
	
	abstract Shape getShape(String shapeType);

}
