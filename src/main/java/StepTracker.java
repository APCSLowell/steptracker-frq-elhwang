import java.util.ArrayList;
public class StepTracker
{
 private minsteps = 0;
 private ArrayList <Integer> Steps = new Arraylist <Integer>();
 private totalsteps = 0;
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
totalsteps += n;
 }
 public double averageSteps{
  return total/Steps.size();
 }
} 
