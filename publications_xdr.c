/*
 * Please do not edit this file.
 * It was generated using rpcgen.
 */

#include "publications.h"

bool_t
xdr_set_publication_1_argument (XDR *xdrs, set_publication_1_argument *objp)
{
	 if (!xdr_string (xdrs, &objp->arg1, ~0))
		 return FALSE;
	 if (!xdr_string (xdrs, &objp->arg2, ~0))
		 return FALSE;
	return TRUE;
}
