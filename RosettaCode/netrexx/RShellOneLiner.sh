#!/bin/sh
 
TNRX=`mktemp T_XXXXXXXXXXXX` && test ! -e $TNRX.* && (echo 'say "Goodbye, World!"' >$TNRX; nrc -exec $TNRX; rm $TNRX $TNRX.*; unset TNRX)
 
#	Output:
#
#		NetRexx portable processor, version NetRexx 3.01, build 40-20120823-0156
#		Copyright (c) RexxLA, 2011,2012.  All rights reserved.
#		Parts Copyright (c) IBM Corporation, 1995,2008.
#		Program T_dO7RQs5HPElq
#		===== Exec: T_dO7RQs5HPElq =====
#		Goodbye, World!
#		Processing of 'T_dO7RQs5HPElq' complete

