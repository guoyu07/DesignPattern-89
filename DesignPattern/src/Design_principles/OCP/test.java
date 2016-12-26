package Design_principles.OCP;

public class test {
	  public static void main(String []a)   
	    {   
//		  遵循开闭原则设计出的模块具有两个主要特征：[1] 
//				  （1）对于扩展是开放的（Open for extension）。这意味着模块的行为是可以扩展的。当应用的需求改变时，我们可以对模块进行扩展，使其具有满足那些改变的新行为。也就是说，我们可以改变模块的功能。
//				  （2）对于修改是关闭的（Closed for modification）。对模块行为进行扩展时，不必改动模块的源代码或者二进制代码。模块的二进制可执行版本，无论是可链接的库、DLL或者.EXE文件，都无需改动。
	        Fruit tempApple;   
	        gardenerBase appleGarden = AppleGardener.getGardener();   
	        tempApple = appleGarden.getFruit();   
	  
	        Fruit tempPear;   
	        gardenerBase pearGarden = PearGardener.getGardener();   
	        tempPear = pearGarden.getFruit();   
	    }   
}
