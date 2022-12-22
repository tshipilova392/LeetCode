package com.company;

public class Solution11ContainerWithMostWater {
    public int maxArea(int[] height) {
        int startPosition = 0;
        int endPosition = height.length-1;
        int maxVolume = 0;
        while (startPosition<endPosition){
            int minHeight = Math.min(height[startPosition], height[endPosition]);
            int diff = endPosition-startPosition;
            maxVolume = Math.max(maxVolume,minHeight*diff);
            if (height[startPosition]< height[endPosition]){
                startPosition++;
            }
            else
            {
                endPosition--;
            }
        }
        return maxVolume;
    }
}
