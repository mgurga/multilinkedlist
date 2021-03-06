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
		head.get_col_mll().get_row_mll().new_col();
		head.get_col_mll().get_row_mll().get_col_mll().set_data("bazcolrowcol");
		head.get_col_mll().get_row_mll().new_row();
		head.get_col_mll().get_row_mll().get_row_mll().set_data("bazcolrow2");
		
		// print head data and its children's data
		System.out.println(head);
		
		// remove "bazrow" node (refer to the diagram) and replace with row
		System.out.println();
		System.out.println("'bazrow' data: " + head.get_col_mll().get_row_mll().get_data());
		head.get_col_mll().get_row_mll().remove(false);
		System.out.println("Removed 'bazrow'");
		System.out.println();
		
		// print head data and its children's data
		System.out.println(head);
	}
}
