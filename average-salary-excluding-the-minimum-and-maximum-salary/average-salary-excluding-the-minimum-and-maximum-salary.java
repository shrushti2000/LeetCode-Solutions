class Solution {
    public double average(int[] salary) {
        double min=salary[0];
        for(int i=0;i<salary.length;i++){
            if(salary[i]<min){
                min=salary[i];
            }
        }
        double max=salary[0];
        for(int i=0;i<salary.length;i++){
            if(salary[i]>max){
                max=salary[i];
            }
        }
        double min_max_sum=min+max;
        double sum=0;
        for(int i=0;i<salary.length;i++){
            sum=sum+salary[i];
        }
        double avg_salary=(sum-min_max_sum)/(salary.length - 2);
        return avg_salary;
    }
}
