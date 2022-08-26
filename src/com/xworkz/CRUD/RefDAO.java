package com.xworkz.CRUD;

import com.xworkz.CRUD.RefDTO;

public abstract class RefDAO{
	
public  RefDTO[] S = new RefDTO[3];

public void saveRefDTO(RefDTO H) {
	S[0] = H;
}

}
