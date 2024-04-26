package Java;

class Problem2 {
    
    public static int charCount(String str, char subString)
    {
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == subString)
                count++;
        }
        return count;
    }

    public static boolean willAttendanceAward(String attendanceRecord)
    {
        int countA = charCount(attendanceRecord.toUpperCase(), 'A');
        boolean isThreeOrMoreLate = attendanceRecord.toUpperCase().contains("LLL");
        if(countA < 2 && !(isThreeOrMoreLate))
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        String s = "PPALPLLLLL";
        System.out.println(willAttendanceAward(s));
    }
}