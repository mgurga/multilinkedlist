public class mlldriver {
	public static void main(String[] args) {
		// this driver will create the multi link list shown in the diagram
		mll head = new mll("foo");
		
		// first create the head->row
		head.new_row("bar");
		head.get_row_mll().new_col("barcol");
		head.get_row_mll().new_row("barrow");
		
		// second create the head->col
		head.new_col("baz");
		head.get_col_mll().new_col("bazcol");
		head.get_col_mll().new_row("bazrow");
		
		// create extended head->col->col nodes
		head.get_col_mll().get_col_mll().new_col("bazcol3");
		head.get_col_mll().get_col_mll().new_row("bazcol2row");
		
		// create extended head->col->row nodes
		head.get_col_mll().get_row_mll().new_col("bazcolrowcol");
		head.get_col_mll().get_row_mll().new_row("bazcolrow2");
		
		// print head data and its children's data
		System.out.println(head);
	}
}
