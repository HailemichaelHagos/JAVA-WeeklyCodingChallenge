package week2;

public class InputData {
	
	public void IdMagicIndex() {
		MagicIndex index = new MagicIndex();
		int[] arr = {3,2,0,1,3};
		index.findMagicIndex(arr);
		
	}
	
	public void IDsubset() {
		
		String valueSet = "wxyz";
		PowerSet.subset(valueSet);
		
		
	}
	
	public void IDrecmul() {
		int ML =2;
		int MD =5;
		int ite =1;
		RecursiveMultiply.RecursiveMultiplicity(ML, MD, ite);
		//System.out.println(result);
		System.out.println(RecursiveMultiply.result);
	}

}
