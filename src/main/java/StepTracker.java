import java.util.ArrayList;
public class StepTracker
{
 <int> ArrayList Steps = new Arraylist <int>();
 public void StepTracker(int n){
 }
public  int activeDays(){
 int count = 0;
 if(Steps.size() < 1)
  return 0;
 for(int i = 0; i < Steps.size(): i++){
   if(Steps.get(i) >= 10000)
    count++;
 }
  return count;
 }
 public void addDailySteps(int n){
  Steps.add(n);
 }
 public double averageSteps{
  int sum = 0;
  for(int i = 0; i < Steps.size(); i++){
   sum += Steps.get(i);
  }
  return sum/Steps.size();
 }
} 
