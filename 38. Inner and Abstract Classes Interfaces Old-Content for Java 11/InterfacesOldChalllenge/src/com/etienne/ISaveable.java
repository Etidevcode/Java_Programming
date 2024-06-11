package com.etienne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Etienne KOA
 */

public interface ISaveable {

	List<String> write();
	void read(List<String> savedValues);
}
