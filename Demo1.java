//������ʮ���˵�ƽ����,ʹ������ʵ��

import java.util.*;
public class Demo1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[]scores = new double[5]; 
		double sum = 0;
		for(int i=0;i<scores.length;i++){
			System.out.print("�������"+(i+1)+"λͬѧ�ĳɼ���");
			//Ϊ�������30�����Ӹ�ֵ
			scores [i] = input.nextDouble();
			sum += scores[i];
		}
		double avg = sum/scores.length;
		System.out.print("�༶ͬѧ��ƽ����Ϊ��"+avg);
	}
}