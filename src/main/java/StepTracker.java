import java.util.ArrayList;
public class StepTracker
{
 private int minsteps;
 private int totaldays;
 private int totalsteps;
 private int active;
public StepTracker(int n){
  minsteps = n;
  totaldays = 0;
  totalsteps = 0;
  active = 0;
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
 public double averageSteps(){
  if(totaldays == 0)
   return 0.0;
  return (double)totalsteps/totaldays;
 }
} 
