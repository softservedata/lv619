package _08_nestedInnerClasses.pt2;

class Wrapper<T extends Shape>{
	Wrapper(T shape){
		System.out.println(shape.getClass().getSimpleName());
	}
}