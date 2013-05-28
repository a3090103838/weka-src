package com.wtj.test;

import java.io.FileReader;
import weka.core.Instances;
public class InstanceTest{
	public static Instances getFileInstances( String fileName ) throws Exception{
		FileReader frData = new FileReader( fileName );
		Instances data = new Instances( frData );
		return data;
	}
	public static void main(String[] args) throws Exception{
		Instances instances = getFileInstances( "/home/wangtianju/ProgramFiles/weka-3-6-9/data/contact-lenses.arff");
		for( int i = 0; i < instances.numInstances(); i++ ){
			System.out.println( instances.instance( i ) );
		}
	}
}
