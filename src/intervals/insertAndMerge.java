package intervals;

import java.util.ArrayList;
import java.util.List;

/*
Q. Given a list of non-overlapping intervals sorted by their start time, insert a given interval at the valid position, merge all the overlapping intervals and return a list of mutually exclusive intervals.

Example-

Input: intervals = [{1, 3}, {5, 7}, {8, 10}], newInterval = [{4, 9}]

Output: [{1, 3}, {4, 10}]
 */
public class insertAndMerge {

    class Interval{
        int start;
        int end;

        Interval(int start,int end){
            this.start=start;
            this.end=end;

        }
    }

    List<Interval> insertAndMergeInterval(List<Interval> intervals, Interval newInterval){
         if(intervals==null|| intervals.isEmpty()){
             return List.of(newInterval);
         }
         int i=0;
         int n=intervals.size();
         List<Interval> result = new ArrayList<>();
         while(i<n && intervals.get(i).end< newInterval.start){
             result.add(intervals.get(i));
             i++;
         }

        while(i<n && intervals.get(i).start <= newInterval.end){
            Interval current=intervals.get(i);
            newInterval.start= Math.min(current.start,newInterval.start);
            newInterval.end= Math.max(current.end,newInterval.end);
            i++;
        }
        result.add(newInterval);
        while(i<n){
        result.add(intervals.get(i));
        i++;
    }
     return result;
    }

    public static void main(String[] args){
        insertAndMerge im = new insertAndMerge();
        List<Interval> interval = new ArrayList<>();
        interval.add(im.new Interval(0,1));
        interval.add(im.new Interval(3,5));
        interval.add(im.new Interval(6,7));
        interval.add(im.new Interval(9,10));

        List<Interval> result = im.insertAndMergeInterval(interval,im.new Interval(2,6));
        for(Interval i: result){
            System.out.print("{"+i.start+","+i.end+"} ");
        }
    }
}
