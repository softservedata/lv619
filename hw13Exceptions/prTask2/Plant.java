package hw13Exceptions.prTask2;

//import com.sun.glass.ui.CommonDialogs.Type;
//import com.sun.prism.paint.Color;

public class Plant {
	
	public static  int squareRectangle (int a, int b) throws IllegalArgumentException {
        //your code
        if(a <= 0 || b <= 0) {
            throw new IllegalArgumentException("both arguments should be more than zero");
        }
        return a * b;
    }

    public static int trySquareRectangle(int a, int b) {
        //your code
        try {
            return squareRectangle(a, b);
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }  
	
	
	/*-
	String name;
	//int size;
	Color color;
	Type type;
	
	
	
	
	
	public Plant(String type, String color, String name) {
		this.type = Type.valueOf(type.toUpperCase());
        this.color = Color.valueOf(color.toUpperCase());
        this.name = name;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Plant [name=" + name + ", color=" + color + ", type=" + type + "]";
	}
	*/





	/*-
	public static void main(String[] args) {
		Plant p1 = new Plant("type11", "red", "romashka");
		
		System.out.println(p1);
	}
	//*/
	
	private String name;
    private Color color;
    private Type type;
    
    
    public Plant(String type, String color, String name) throws ColorException, TypeException {
        try {
    		this.type = Type.valueOf(type.toUpperCase());
    	}catch(IllegalArgumentException e) {
    		throw new TypeException("Invalid value " + type + " for field type");
    	}
    	
    	try {
    		this.color = Color.valueOf(color.toUpperCase());
    	}catch(IllegalArgumentException e) {
    		throw new ColorException("Invalid value " + color + " for field color");
    	}
    	
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Color getColor() {
        return this.color;
    }
    
    public Type getType() {
        return this.type;
    }
    //{type: Rare, color: Red, name: MyPlant}
    
    public String toString() {
        return "{type: " + type.name().substring(0, 1) + type.name().substring(1).toLowerCase() + ", color: " + color.name().substring(0, 1) + color.name().substring(1).toLowerCase() + ", name: " + name + "}";
    }
    
    void setColor(Color color) {
    	this.color = color;
    }
    
    void seType(Type type) {
    	this.type = type;
    }
    /*-
	public static Plant tryCreatePlant(String type, String color, String name) throws Exception {
    	//new Plant(Type.ORDINARY.name(), Color.RED.name(), name);
    	Plant p1 = new Plant(Type.ORDINARY.name(), Color.RED.name(), name);
    	try {
            p1 = new Plant(type, color, name);
        } catch (TypeException e) {
            return p1 = new Plant(Type.ORDINARY.name(), color, name);
        } catch (ColorException ex) {
        	return p1 = new Plant(type, Color.RED.name(), name);
        } catch (Exception e) {
        	
        }
    	return p1;
        
    }
    */
    /*- 
    public static Plant tryCreatePlant(String type, String color, String name)throws Exception {
    	Plant p1 = new Plant("ORDINARY", "RED", name);
    	try {
            p1 = new Plant(type, color, name);
        } catch (TypeException e) {
            return p1 = new Plant("ORDINARY", color, name);
        } catch (ColorException ex) {
        	return p1 = new Plant(type, "RED", name);
        } 
    	return p1; 
    }
    */
   
    /*-
    public static Plant tryCreatePlant(String type, String color, String name) throws Exception {
    	Plant p1 = new Plant("ORDINARY", "RED", name);
    	try {
    		p1 = new Plant(type, color, name);
    	} catch(TypeException | ColorException ex) {
    		if(ex instanceof TypeException) {
    			return p1 = new Plant("ORDINARY", color, name);
    		}
    		if (ex instanceof ColorException) {
    			return p1 = new Plant(type, "RED", name);
    		}
    		
    	}
    	finally {
			return p1;// = new Plant("ORDINARY", "RED", name);
		} 
    	//return p1;	
    }
    */
    
    public static void main(String[] args) {
    	try {
    		System.out.println("ok");
    		System.out.println("ok");
    		System.out.println("ok");
    		System.out.println("ok");
    		System.out.println("ok");
    		Plant p1 = Plant.tryCreatePlant("Unknown", "Ocean", "MyPlant");
    		//System.out.println("Done");
    		System.out.println(p1);
    		
    		System.out.println("Done");
    		throw new Exception("Dont work point");
    	} catch (Exception e) {
    		System.out.println();
    		System.out.println("Not working");
    	}
    	
    }
    
    public static Plant tryCreatePlant(String type, String color, String name) {
        while (true) {
            try {
                return new Plant(type, color, name);
            }
            catch(TypeException Texcep) {
                type = "Ordinary";
            }
            catch(ColorException Cexcep) {
                color = "Red";
            }
        }
    }
    
    
    public static Plant tryCreatePlant(String type, String color, String name) throws Exception {
    	Plant p1 = new Plant("ORDINARY", "RED", name);
    	try {
    		p1 = new Plant(type, color, name);
    	} catch(TypeException | ColorException ex) {
    		if(ex instanceof TypeException) {
    			return p1 = new Plant("ORDINARY", color, name);
    		}
    		if (ex instanceof ColorException) {
    			return p1 = new Plant(type, "RED", name);
    		}
    		
    	}
    	finally {
			return p1;// = new Plant("ORDINARY", "RED", name);
		} 
    	//return p1;	
    }
    

}
