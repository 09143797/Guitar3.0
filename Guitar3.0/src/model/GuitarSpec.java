package model;
import model.Builder; 
import model.Type; 
import model.Wood; 
 
 
 public class GuitarSpec { 
 	//吉他的通有属性。   
 	 private Builder builder;  
 	  private String model; 
 	  private Type type; 
 	  private int numStrings; 
 	  private Wood backWood; 
 	  private Wood topWood; 
 
 
 	   
 	   
 	  public GuitarSpec(Builder builder, String model, Type type, 
 	                    int numStrings, Wood backWood, Wood topWood) { 
 	    this.builder = builder; 
 	    this.model = model; 
 	    this.type = type; 
 	    this.numStrings = numStrings; 
 	    this.backWood = backWood; 
 	    this.topWood = topWood; 
 	  } 
 
 
 	  public Builder getBuilder() { 
 	    return builder; 
 	  } 

 
 	  public String getModel() { 
 	    return model; 
 	  } 
 
 
	  public Type getType() { 
 	    return type; 
 	  } 
 
 
	  public int getNumStrings() { 
 	    return numStrings; 
 	  } 
 
 
 	  public Wood getBackWood() { 
 	    return backWood; 
 	  } 
 

	  public Wood getTopWood() { 
 	    return topWood; 
 	  } 
 
 
 	  //返回布尔类型。 
	  public boolean matches(GuitarSpec otherSpec) { 
	    if (builder != otherSpec.builder) 
 	      return false; 
 	    if ((model != null) && (!model.equals("")) && 
 	        (!model.toLowerCase().equals(otherSpec.model.toLowerCase()))) 
 	      return false; 
 	    if (type != otherSpec.type) 
	      return false; 
	    if (numStrings != otherSpec.numStrings) 
 	      return false; 
 	    if (backWood != otherSpec.backWood) 
	      return false; 
	    if (topWood != otherSpec.topWood) 
 	      return false; 
	    return true; 
 	  } 
 	} 

/*public class GuitarSpec { 
 	private String builder;  
 	private String type; 
 	private String backWood; 
	private String topWood; 
 	 
	public GuitarSpec(String builder, String type, String backWood, String topWood){ 
 		this.builder = builder; 
 		this.type = type; 
 		this.backWood = backWood; 
 		this.topWood = topWood; 
	} 
   
 	public String getBuilder() { 
 		return builder; 
 	} 
 	public void setBuilder(String builder) { 
 		this.builder = builder; 
 	}	 
 	public String getType() { 
 		return type; 
 	} 
 	public void setType(String type) { 
 		this.type = type; 
 	} 
 	public String getBackWood() { 
 		return backWood; 
 	} 
 	public void setBackWood(String backWood) { 
 		this.backWood = backWood; 
 	} 
 	public String getTopWood() { 
 		return topWood; 
 	} 
 	public void setTopWood(String topWood) { 
 		this.topWood = topWood; 
 	} 

 
 	 
 	public boolean matches(GuitarSpec otherSpec) { 
 	    if (!builder.equals(otherSpec.builder)) 
 		    return false; 
 		if (!type.equals(otherSpec.type)) 
 		    return false; 
 		if (!backWood.equals(otherSpec.backWood)) 
 		    return false; 
 		if (!topWood.equals(otherSpec.topWood)) 
 		    return false; 
 	    return true; 
 	} 
 } */
