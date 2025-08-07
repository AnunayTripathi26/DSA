package Strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LC539MinimumTimeDifference {
    public static void main(String[] args) {
        List<String> timePoitns = new ArrayList<>();
        timePoitns.add("00:00");
        timePoitns.add("23:59");
        timePoitns.add("00:00");
        System.out.println(findMinDifference(timePoitns));
    }

    public static int findMinDifference(List<String> timePoints) {
        List<Integer> MinList = new ArrayList<>();
        minDifference(timePoints, 0, MinList);
//        for(int i=0;i<MinList.size()-1;i++){
//            if(MinList.get(i)>MinList.get(i+1)){
//                int temp=MinList.get(i);
//                MinList.set(i,MinList.get(i+1));
//                MinList.set(i+1,temp);
//            }
//        }
        Collections.sort(MinList);

        int minDiff=Integer.MAX_VALUE;
        for(int i=1;i<MinList.size();i++){
            int diff=MinList.get(i)-MinList.get(i-1);
            if(diff<minDiff){
                minDiff=diff;
            }
        }
        int circularDiff=(1440+MinList.get(0))-MinList.get(MinList.size()-1);
        if(circularDiff<minDiff){
            minDiff=circularDiff;
        }
        return minDiff;

    }

    static void minDifference(List<String> timePoints, int i, List<Integer> minutes) {
        if (i == timePoints.size()) {
            return;
        }
        int minDifference = 0;
        String s = timePoints.get(i);
        String[] parts = s.split(":");
        int hours = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);
        int totalminutes = hours * 60 + min;
        minutes.add(totalminutes);
        minDifference(timePoints, i + 1, minutes);
    }
}



//        int Difference=(1440+minDifference(timePoints,i+1))-totalminutes;


//        for(String s:timePoints){
//            String [] parts=s.split(":");
//            int hours=Integer.parseInt(parts[0]);
//            int minutes=Integer.parseInt(parts[1]);
//            totalminutes=hours*60+minutes;
//            minDifference=
//
//        }
//        return 0;
//    }
//}
