package com.bloodorganmanagementsystem.app.entities;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

enum TestName {

	ANTIBODY, BLOOD, BONEMARROW, CANCER, CHEST, COLONSCOPY, CROSSMATCH, CT, DOPPLER, ECHOCARDIOGRAM, EKG,
	ELECTROCARDIOGRAM, GYENCOLOGICAL, HEPATITIS_B, HEPATITIS_C, HIV, HLA, HTIV, PET, PHYSICAL, PULMONARY, SYPHILIS,
	URINE
}
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test  {

	private TestName testName;
	private boolean hasPassed;
	private Date dateOFLastUpdate;

}