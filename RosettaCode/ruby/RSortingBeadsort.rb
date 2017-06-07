#!/usr/bin/env ruby

class Array
	def beadsort
		self.map {|e| [1] * e}.columns.columns.map {|e| e.length}
	end

	def columns
		y = self.length
		x = self.map {|l| l.length}.max

		Array.new(x) do |row|
			Array.new(y) { |column|
				self[column][row]
			}.compact # Remove nulls.
		end
	end
end
 
# Demonstration code:
harry = [5,3,1,7,4,1,1]
puts harry.inspect
puts harry.beadsort.inspect

