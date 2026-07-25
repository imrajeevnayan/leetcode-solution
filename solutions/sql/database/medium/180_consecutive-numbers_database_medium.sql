SELECT DISTINCT Num AS ConsecutiveNums
FROM (
    SELECT Num,
           LAG(Num,1) OVER(ORDER BY Id) AS PrevNum,
           LEAD(Num,1) OVER(ORDER BY Id) AS NextNum
    FROM Logs
) t
WHERE Num = PrevNum AND Num = NextNum;