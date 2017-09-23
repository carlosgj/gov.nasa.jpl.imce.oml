#!/bin/bash

awk '
BEGIN {flag=0}
/(Down|Up)loading:/{flag+=1;next}
/Downloaded:/{flag-=1;next}
/\[INFO\]\ Fetching\ [^[:blank:]]*\ from\ [^[:blank:]]* \([^[:blank:]]*\ at\ [^[:blank:]]*\)/{next}
/\[INFO\]\ Fetching\ [^[:blank:]]*\ from\ [^[:blank:]]* \([^[:blank:]]*\ of\ [^[:blank:]]*\ at\ [^[:blank:]]*\)/{next}
/Uploaded:/{flag-=1;if(flag>0)print}
{if(flag==0) print; else next;}'
