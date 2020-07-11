array = [5,4,3,2,1]
array_reversed = []

array.each do |x|
    array_reversed.unshift x
end

puts array_reversed