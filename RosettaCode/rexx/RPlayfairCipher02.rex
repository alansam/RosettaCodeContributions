/* Rexx */

parse arg ciph IorQ key text
if ciph = '' | ciph = '.' then ciph = 'E'
if IorQ = '' | IorQ = '.' then IorQ = 'I'
if key  = '' | key  = '.' then key  = 'plugh_xyzzy'
if text = '' | text = '.' then text = 'NetRexx; not just a programing language for kings & queens!'
-- 'Hide the gold in the tree stump!'

  kr = getKey(key~space(0), IorQ)
  say IorQ '-' kr',' kr~words
  call getKeyMatrix kr
  loop r_= 1 to km.0
    say r_~right(2) km.r_
    end r_

  digraphs = getDigraphs(text, IorQ, ciph)
  -- fixup for a Q in the text when Q is excluded (substitute K for Q)
  if IorQ~upper = 'Q' then digraphs = digraphs~changestr('Q', 'K')
  say text
  say IorQ '-' digraphs',' digraphs~words
  if ciph~upper() = 'E' then
    say encipher(digraphs)
  else 
    say decipher(digraphs)
  
exit

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
cipher:
procedure expose km.
--trace ?r;nop
  parse arg d_, digraphs
  if d_~upper() = 'D' then d_ = -1
  else                     d_ = +1
  cipherText = ''
  loop dw = 1 to digraphs~words()
    digraph = digraphs~word(dw)
    cl = ''
    cr = ''
    parse value digraph with dl +1 dr
    loop r_ = 1 to km.0 while (cl cr)~words() < 4
      clx = km.r_~wordpos(dl)
      crx = km.r_~wordpos(dr)
      if clx > 0 then cl = r_ clx
      if crx > 0 then cr = r_ crx
      end r_

    select
      when cl~word(1) = cr~word(1) then do
        ptype = 'row'
        rx  = cl~word(1)
        clx = cl~word(2) + d_
        crx = cr~word(2) + d_
        if clx > 5 then clx = 1
        if crx > 5 then crx = 1
        if clx < 1 then clx = 5
        if crx < 1 then crx = 5
        cy = km.rx~word(clx) || km.rx~word(crx)
        cipherText = cipherText cy
        end
      when cl~word(2) = cr~word(2) then do
        ptype = 'column'
        cx  = cl~word(2)
        rlx = cl~word(1) + d_
        rrx = cr~word(1) + d_
        if rlx > 5 then rlx = 1
        if rrx > 5 then rrx = 1
        if rlx < 1 then rlx = 5
        if rrx < 1 then rrx = 5
        cy = km.rlx~word(cx) || km.rrx~word(cx)
        cipherText = cipherText cy
        end
      otherwise do
        ptype = 'rectangle'
        r1  = cl~word(1)
        r2  = cr~word(1)
        cy = km.r1~word(cr~word(2)) || km.r2~word(cl~word(2))
        cipherText = cipherText cy
        end
      end
    say digraph cl',' cr '-' cy '-' ptype
    end dw
  return cipherText~strip()

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
encipher:
procedure expose km.
  parse arg digraphs
  return cipher('E', digraphs)

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
decipher:
procedure expose km.
  parse arg digraphs
  return cipher('D', digraphs)

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
getDigraphs:
procedure
  parse arg text, IorQ, ED
  a2z = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
  if ED~upper() \= 'D', then eks = 'X'
  else                       eks = ''
  tp = text~upper()~translate(, a2z)
  text = text~upper()~translate(' '~copies(tp~length()), tp)~space(0)
  rtext = ''
  ll = ''

  loop while text \= ''
    parse var text lc +1 text
    if ll \= lc then rtext = rtext || lc
    else             rtext = rtext || eks || lc
    ll = lc
    end

  -- I == J or remove Q fixup
  if IorQ \= 'Q' then
    parse value 'J I' with IorQ sc .
  else
    sc = ''

  rtext = rtext~changestr(IorQ, sc)
  if rtext~length() // 2 \= 0 then rtext = rtext || eks
  digraphs = ''
  loop while rtext \= ''
    parse var rtext digraph +2 rtext
    digraphs = digraphs digraph
    end
  return digraphs~space()

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
getKey:
procedure
  parse arg key, IorQ
  a2z = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
  kp = (key || a2z)~upper()
  kr = ''
  loop while kp \= ''
    parse var kp xx +1 kp
    if \xx~datatype('u') then iterate
    kr = kr xx
    kp = kp~changestr(xx, '')
    end

  if IorQ = 'I' | IorQ = 'J' | IorQ = '' then
    kr = kr~changestr('J', '')
  else
    kr = kr~changestr('Q', '')

  return kr~space()

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
getKeyMatrix:
procedure expose km.
  parse arg kr
  km. = ''
  loop r_ = 1 while kr \= ''
    parse var kr kp +10 kr
    km.0 = r_
    km.r_ = kp
    end r_
  return

/*
....+....|....+....|....+....|....+....|....+....|....+....|....+....|....+....|
*/

