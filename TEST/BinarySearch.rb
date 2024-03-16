def binary_search(arr, target)
    low = 0
    high = arr.length - 1

    while low <= high
    mid = (low + high) / 2
        if arr[mid] == target
            return mid
        elsif arr[mid] < target
            low = mid + 1
        else
            high = mid - 1
        end
    end
        return -1  # Target not found
end

    # Example usage:
    arr = [1, 3, 5, 7, 9, 11, 13, 15]
    target = 7
    result = binary_search(arr, target)
    if result != -1
        puts "Target #{target} found at index #{result}."
    else
    puts "Target #{target} not found in the array."
    end
