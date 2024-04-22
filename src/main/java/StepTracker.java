import java.util.ArrayList;
public class StepTracker
{
 private minsteps = 0;
 private totaldays = 0;
 private totalsteps = 0;
private active = 0;
public void StepTracker(int n){
  minsteps = n;
 }
public  int activeDays(){
  return active;
 }
 public void addDailySteps(int n){
  if(n >= minsteps)
  active ++;
  totalsteps += n;
 totaldays++;
 }
 public double averageSteps{
  return (double)totalsteps/Steps.size();
 }
} 
