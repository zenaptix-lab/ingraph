WITH [1, 3.14, true, [], {}, null] AS operands
UNWIND operands AS op1
UNWIND operands AS op2
WITH op1 STARTS WITH op2 AS v
RETURN v, count(*)
