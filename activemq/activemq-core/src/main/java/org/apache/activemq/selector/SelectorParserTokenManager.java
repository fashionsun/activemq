/* Generated By:JavaCC: Do not edit this line. SelectorParserTokenManager.java */
package org.apache.activemq.selector;
import java.io.*;
import java.util.*;
import javax.jms.InvalidSelectorException;
import org.apache.activemq.filter.*;

public class SelectorParserTokenManager implements SelectorParserConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 2;
         return jjMoveNfa_0(5, 0);
      case 10:
         jjmatchedKind = 3;
         return jjMoveNfa_0(5, 0);
      case 12:
         jjmatchedKind = 5;
         return jjMoveNfa_0(5, 0);
      case 13:
         jjmatchedKind = 4;
         return jjMoveNfa_0(5, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(5, 0);
      case 37:
         jjmatchedKind = 41;
         return jjMoveNfa_0(5, 0);
      case 40:
         jjmatchedKind = 34;
         return jjMoveNfa_0(5, 0);
      case 41:
         jjmatchedKind = 36;
         return jjMoveNfa_0(5, 0);
      case 42:
         jjmatchedKind = 39;
         return jjMoveNfa_0(5, 0);
      case 43:
         jjmatchedKind = 37;
         return jjMoveNfa_0(5, 0);
      case 44:
         jjmatchedKind = 35;
         return jjMoveNfa_0(5, 0);
      case 45:
         jjmatchedKind = 38;
         return jjMoveNfa_0(5, 0);
      case 47:
         jjmatchedKind = 40;
         return jjMoveNfa_0(5, 0);
      case 60:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_0(0x220000000L);
      case 61:
         jjmatchedKind = 28;
         return jjMoveNfa_0(5, 0);
      case 62:
         jjmatchedKind = 30;
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0xc000L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x40100L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 88:
         return jjMoveStringLiteralDfa1_0(0x180000L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0xc000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x40100L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 120:
         return jjMoveStringLiteralDfa1_0(0x180000L);
      default :
         return jjMoveNfa_0(5, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 0);
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 1;
         }
         break;
      case 62:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 1;
         }
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 78:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 80:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 81:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 82:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 83:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 110:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 113:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 114:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 115:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 1);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 1);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 67:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 68:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 2;
         }
         break;
      case 75:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x60000L);
      case 84:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x110000L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 100:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 2;
         }
         break;
      case 107:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x60000L);
      case 116:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x110000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 2);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 2);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 69:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 76:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 3;
         }
         break;
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 84:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 87:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 101:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 108:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 3;
         }
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 119:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 3);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 3);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 72:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 4;
         }
         break;
      case 80:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 101:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 104:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 4;
         }
         break;
      case 112:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 4);
}
private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 4);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 89:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 5;
         }
         break;
      case 101:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 121:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 5);
}
private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 5);
   }
   switch(curChar)
   {
      case 78:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 6;
         }
         break;
      case 110:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 6;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 6);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 43;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 3);
                  else if (curChar == 36)
                  {
                     if (kind > 27)
                        kind = 27;
                     jjCheckNAdd(27);
                  }
                  else if (curChar == 39)
                     jjCheckNAddStates(4, 6);
                  else if (curChar == 46)
                     jjCheckNAdd(17);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 0;
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                     jjCheckNAddTwoStates(14, 15);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 23)
                        kind = 23;
                     jjCheckNAddTwoStates(40, 42);
                  }
                  break;
               case 0:
                  if (curChar == 45)
                     jjCheckNAddStates(7, 9);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(7, 9);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 3:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 7:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 8:
                  if (curChar == 42)
                     jjCheckNAddStates(10, 12);
                  break;
               case 9:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(10, 8);
                  break;
               case 10:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(10, 8);
                  break;
               case 11:
                  if (curChar == 47 && kind > 7)
                     kind = 7;
                  break;
               case 12:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 13:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAddTwoStates(14, 15);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAddTwoStates(14, 15);
                  break;
               case 16:
                  if (curChar == 46)
                     jjCheckNAdd(17);
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAddTwoStates(17, 18);
                  break;
               case 19:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(20);
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(20);
                  break;
               case 21:
               case 22:
                  if (curChar == 39)
                     jjCheckNAddStates(4, 6);
                  break;
               case 23:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddStates(4, 6);
                  break;
               case 25:
                  if (curChar == 39 && kind > 26)
                     kind = 26;
                  break;
               case 26:
                  if (curChar != 36)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(27);
                  break;
               case 27:
                  if ((0x3ff001000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(27);
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 3);
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(29, 30);
                  break;
               case 30:
                  if (curChar != 46)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAddTwoStates(31, 32);
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAddTwoStates(31, 32);
                  break;
               case 33:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(34);
                  break;
               case 34:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(34);
                  break;
               case 35:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(35, 36);
                  break;
               case 37:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(38);
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(38);
                  break;
               case 39:
                  if (curChar != 48)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAddTwoStates(40, 42);
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 42:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(42);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 5:
               case 27:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(27);
                  break;
               case 1:
                  jjAddStates(7, 9);
                  break;
               case 7:
                  jjCheckNAddTwoStates(7, 8);
                  break;
               case 9:
               case 10:
                  jjCheckNAddTwoStates(10, 8);
                  break;
               case 15:
                  if ((0x100000001000L & l) != 0L && kind > 21)
                     kind = 21;
                  break;
               case 18:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(13, 14);
                  break;
               case 24:
                  jjAddStates(4, 6);
                  break;
               case 32:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(15, 16);
                  break;
               case 36:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(17, 18);
                  break;
               case 40:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(41);
                  break;
               case 41:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAdd(41);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(7, 9);
                  break;
               case 7:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 9:
               case 10:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(10, 8);
                  break;
               case 24:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(4, 6);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 43 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static final int[] jjnextStates = {
   29, 30, 35, 36, 23, 24, 25, 1, 2, 4, 8, 9, 11, 19, 20, 33, 
   34, 37, 38, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default : 
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, "\75", "\74\76", "\76", "\76\75", "\74", "\74\75", "\50", "\54", "\51", "\53", 
"\55", "\52", "\57", "\45", };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x3fffdffff01L, 
};
static final long[] jjtoSkip = {
   0xfeL, 
};
static final long[] jjtoSpecial = {
   0x3eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[43];
private final int[] jjstateSet = new int[86];
protected char curChar;
public SelectorParserTokenManager(SimpleCharStream stream)
{
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public SelectorParserTokenManager(SimpleCharStream stream, int lexState)
{
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 43; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

}
