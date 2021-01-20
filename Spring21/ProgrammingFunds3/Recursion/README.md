Recursion Study Guide

Recursion - is a technique for elegant solutions to problems that can't use loops

Base Case - or stopping condition, is a recursive method solving the simplest case

Recursive call - new problem (subproblem) resembles original rpoblem, method calls fresh copy of itself to work smaller problem

Infinite Recursion - recursion doesn't reduce problem to base case, or no base case specifid

Direct Recursion - method invokes self

Indirect Recursion - another method invokes recursive method

Any method that implements Recursion has two basic parts:
1) Method call which can call itself i.e. recursive
2) A precondition that will stop the recursion

    methodName (T parameters…)
    {   
    if (precondition == true)    
    //precondition or base condition
     {
            return result;
        }
        return methodName (T parameters…);
          //recursive call
    }
