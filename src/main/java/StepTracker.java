import java.util.ArrayList;
public class StepTracker
{
 private minsteps = 0;
 private ArrayList <int> Steps = new Arraylist <int>();
 public void StepTracker(int n){
  minsteps = n;
 }
public  int activeDays(){
 private int count = 0;
 if(Steps.size() < 1)
  return 0;
 for(int i = 0; i < Steps.size(); i++){
   if(Steps.get(i) >= minsteps)
    count++;
 }
  return count;
 }
 public void addDailySteps(int n){
  Steps.add(n);
 }
 public double averageSteps{
  private int sum = 0;
  for(int i = 0; i < Steps.size(); i++){
   sum += Steps.get(i);
  }
  return sum/Steps.size();
 }
} 
