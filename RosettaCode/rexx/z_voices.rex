/* Rexx */

do
	-- The list produced by 'say --voices=?'
  queue "Agnes               en_US    # Isn't it nice to have a computer that will talk to you?"
  queue "Albert              en_US    #  I have a frog in my throat. No, I mean a real frog!"
  queue "Alex                en_US    # Most people recognize me by my voice."
  queue "Bad News            en_US    # The light you see at the end of the tunnel is the headlamp of a fast approaching train."
  queue "Bahh                en_US    # Do not pull the wool over my eyes."
  queue "Bells               en_US    # Time flies when you are having fun."
  queue "Boing               en_US    # Spring has sprung, fall has fell, winter's here and it's colder than usual."
  queue "Bruce               en_US    # I sure like being inside this fancy computer"
  queue "Bubbles             en_US    # Pull the plug! I'm drowning!"
  queue "Cellos              en_US    # Doo da doo da dum dee dee doodly doo dum dum dum doo da doo da doo da doo da doo da doo da doo"
  queue "Deranged            en_US    # I need to go on a really long vacation."
  queue "Fred                en_US    # I sure like being inside this fancy computer"
  queue "Good News           en_US    # Congratulations you just won the sweepstakes and you don't have to pay income tax again."
  queue "Hysterical          en_US    # Please stop tickling me!"
  queue "Junior              en_US    # My favorite food is pizza."
  queue "Kathy               en_US    # Isn't it nice to have a computer that will talk to you?"
  queue "Pipe Organ          en_US    # We must rejoice in this morbid voice."
  queue "Princess            en_US    # When I grow up I'm going to be a scientist."
  queue "Ralph               en_US    # The sum of the squares of the legs of a right triangle is equal to the square of the hypotenuse."
  queue "Trinoids            en_US    # We cannot communicate with these carbon units."
  queue "Vicki               en_US    # Isn't it nice to have a computer that will talk to you?"
  queue "Victoria            en_US    # Isn't it nice to have a computer that will talk to you?"
  queue "Whisper             en_US    # Pssssst, hey you, Yeah you, Who do ya think I'm talking to, the mouse?"
  queue "Zarvox              en_US    # That looks like a peaceful planet."

	loop lc = 1 while queued() > 0
		parse pull voice "en_US" . phrase
		voice = strip(voice)
		say right(lc, 3) voice
		say right('', 3) strip(phrase)
		'say --voice="'voice'"' '"'phrase'"'
	end lc

	return
end
exit

