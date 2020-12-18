
public class mll {
	private String data = "";
	private mll mll_row_next = null;
	private mll mll_col_next = null;
	private mll mll_prev = null;
	
	public mll() {
		// empty constructor
	}
	
	public mll(String initData) {
		// init with data
		data = initData;
	}
	
	public mll new_row() {
		mll_row_next = new mll();
		mll_row_next.set_prev(this);
		return mll_row_next;
	}

	public mll new_row(String newData) {
		mll_row_next = new mll(newData);
		mll_row_next.set_prev(this);
		return mll_row_next;
	}
	
	public mll new_col() {
		mll_col_next = new mll();
		mll_col_next.set_prev(this);
		return mll_col_next;
	}
	
	public mll new_col(String newData) {
		mll_col_next = new mll(newData);
		mll_col_next.set_prev(this);
		return mll_col_next;
	}
	
	public void set_col(mll newCol) {
		mll_col_next = newCol;
	}
	
	public void set_row(mll newRow) {
		mll_row_next = newRow;
	}
	
	public void set_prev(mll newprev) {
		mll_prev = newprev;
	}
	
	public void setData(String newData) {
		data = newData;
	}
	
	public String getData() {
		return data;
	}
	
	public mll get_col_mll() {
		return mll_col_next;
	}
	
	public mll get_row_mll() {
		return mll_row_next;
	}
	
	public mll get_prev_mll() {
		return mll_prev;
	}
	
	public void remove(boolean tocol) {
		if(tocol) {
			mll_prev.set_col(mll_col_next);
		} else {
			mll_prev.set_row(mll_row_next);
		}
	}
	
	public String toString() {
		return "data: " + data + "\n" +
				"┣row: " + mll_row_next.toString(1, true) + "\n" +
				"┣col: " + mll_col_next.toString(1, false);
	}
	
	public String toString(int level, boolean ending) {
		
//		if(data == null || mll_row_next == null || mll_col_next == null) {
//			return "not enough data. " + !(data == null) + " " + !(mll_row_next == null) + " " + !(mll_col_next == null);
//		}
		
		String textspace;
		if(ending) {
			textspace = "┃";
		} else {
			textspace = "";
		}
		textspace = "┃";
		 
		for(int i = 0; i < level; i++) {
			textspace += "\t┃";
		}
		
		String mll_row_text = "null";
		String mll_col_text = "null";
		String mll_data_text = "null";
		if(!(mll_row_next == null)) {
			mll_row_text = mll_row_next.toString(level + 1, true);
		}
		if(!(mll_col_next == null)) {
			mll_col_text = mll_col_next.toString(level + 1, false);
		}
		if(!(data == null)) {
			mll_data_text = data;
		}
		
		return "data: " + mll_data_text + "\n" +
				textspace + "┣row: " + mll_row_text + "\n" +
				textspace + "┣col: " + mll_col_text;
	}
}
