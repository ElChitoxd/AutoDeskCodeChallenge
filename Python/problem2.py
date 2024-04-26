def willAttendanceAward(attendanceRecord):
    attendanceRecord = str(attendanceRecord)
    countA = attendanceRecord.count("A")
    isThreeOrMoreLate = "LLL" in attendanceRecord
    if(countA < 2 and not(isThreeOrMoreLate)):
        return True
    else:
        return False
    
if __name__ == "__main__":
    print(willAttendanceAward("PPPLALL"))
    