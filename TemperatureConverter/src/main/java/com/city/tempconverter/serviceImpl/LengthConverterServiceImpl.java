package com.city.tempconverter.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.city.tempconverter.repository.ConvertRepo;
import com.city.tempconverter.service.ConvertService;


@Component
public class LengthConverterServiceImpl implements ConvertService {
	
	@Autowired
	ConvertRepo repo;
	

	 double convertedValues;
	 double kmToMeter;
	 double inchToMeter;
	 double footToMeter;
	 double mileToMeter;
	 double mmToMeter;
	 double cmToMeter;
	 

	@Override
	public double convertedMetric(String convertedUnit,String fromUnit, String toUnit, double value) {
		
		
		switch(convertedUnit)
		{
		case "kmToMtr": 
			kmToMeter = repo.findFormulaByUnit(fromUnit, toUnit);
		     convertedValues = value* kmToMeter;	
		 break;
		
		case "mtrToKm":
		
			convertedValues = value/kmToMeter;
		 break;
		 
		case "inToMtr":
			
			convertedValues = value*inchToMeter;
		 break;
		 
		case "mtrToIn":
			
			convertedValues = value/inchToMeter;
		 break;
		case "ftToMtr":
			
			convertedValues = value*footToMeter;
		 break;
		case "mtrToFt":
			
			convertedValues = value/footToMeter;
		 break;
		case "mleToMtr":
			
			convertedValues = value*mileToMeter;
		 break;
		 
         case "mtrToMle":
			
			convertedValues = value/mileToMeter;
		 break;
		 
         case "miliMtrToMtr":
 			
 			convertedValues = value*mmToMeter;
 		 break;
 		 
         case "mtrTomiliMtr":
 			
 			convertedValues = value/mmToMeter;
 		 break;
 		 
		 
		}
		return convertedValues;
		
	

	
		
	}

	/*@Override
	public double convertedMetricInchToMeter(String fromUnit, String toUnit, double value) {
		if(fromUnit.equalsIgnoreCase("inch")&& toUnit.equalsIgnoreCase("meter")) {
			
			 inchToMeter = repo.findByFromUnit_To_ToUnit(fromUnit, toUnit);
			convertedValues = value* inchToMeter;	
			 
		}
		else 
			{
			convertedValues = value/inchToMeter;
		
			}
		return convertedValues;
		
	}

	@Override
	public double convertedMetricFootToMeter(String fromUnit, String toUnit, double value) {
		if(fromUnit.equalsIgnoreCase("foot")&& toUnit.equalsIgnoreCase("meter")) {
			
			footToMeter = repo.findByFromUnit_To_ToUnit(fromUnit, toUnit);
			convertedValues = value* footToMeter;	
			 
		}
		else 
			{
			convertedValues = value/footToMeter;
		
			}
		return convertedValues;
	}

	@Override
	public double convertedMetricMileToMeter(String fromUnit, String toUnit, double value) {
		
   if(fromUnit.equalsIgnoreCase("mile")&& toUnit.equalsIgnoreCase("meter")) {
			
			mileToMeter = repo.findByFromUnit_To_ToUnit(fromUnit, toUnit);
			convertedValues = value* mileToMeter;	
			 
		}
		else 
			{
			convertedValues = value/mileToMeter;
		
			}
		return convertedValues;
	}

	@Override
	public double convertedMetricMmToMeter(String fromUnit, String toUnit, double value) {
		 if(fromUnit.equalsIgnoreCase("mm")&& toUnit.equalsIgnoreCase("meter")) {
				
				mmToMeter = repo.findByFromUnit_To_ToUnit(fromUnit, toUnit);
				convertedValues = value* mmToMeter;	
				 
			}
			else 
				{
				convertedValues = value/mmToMeter;
			
				}
			return convertedValues;
	}

	@Override
	public double convertedMetricCmToMeter(String fromUnit, String toUnit, double value) {
		 if(fromUnit.equalsIgnoreCase("cm")&& toUnit.equalsIgnoreCase("meter")) {
				
				cmToMeter = repo.findByFromUnit_To_ToUnit(fromUnit, toUnit);
				convertedValues = value* cmToMeter;	
				 
			}
			else 
				{
				convertedValues = value/cmToMeter;
			
				}
			return convertedValues;
	}
*/
}
