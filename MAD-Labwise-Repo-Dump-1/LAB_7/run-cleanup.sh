#!/bin/bash

# Get the current directory
current_dir=$(pwd)

# Find all subdirectories (excluding current directory) up to first level
subdirectories=$(find . -maxdepth 1 -type d ! -path .)

# Copy the cleanup.sh script to each subdirectory
for dir in $subdirectories; do
  cp cleanup.sh "$dir"
done

# Execute cleanup.sh in each subdirectory
for dir in $subdirectories; do
  # Change directory to subdirectory
  cd "$dir"

  # Execute cleanup.sh script
  bash cleanup.sh

  # Return to the original directory
  cd "$current_dir"
done

