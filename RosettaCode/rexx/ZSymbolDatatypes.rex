/* Rexx */

syms = "! ? _ @ # $ . \ /"

Do _s = 1 to words(syms)
  !s = word(syms, _s)
  if datatype(!s, 'S') then do
    ?s = "valid symbol"
    end
  else do
    ?s = "invalid symbol"
    end
  Say _s !s ?s 
  End _s
Return
Exit

