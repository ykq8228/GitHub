//计算三十个人的平均分,使用数组实现

import java.util.*;
public class Demo1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[]scores = new double[5]; 
		double sum = 0;
		for(int i=0;i<scores.length;i++){
			System.out.print("请输入第"+(i+1)+"位同学的成绩：");
			//为数组里的格子赋值
			scores [i] = input.nextDouble();
			sum += scores[i];
		}
		double avg = sum/scores.length;
		System.out.print("班级同学的平均分为："+avg);
	}
}
