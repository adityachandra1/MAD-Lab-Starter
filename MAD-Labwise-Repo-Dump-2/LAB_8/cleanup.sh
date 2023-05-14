#!/bin/bash

current_dir=$(pwd)
find "$current_dir" -name "*Test*" -exec rm -rf {} +
rm -rf "$current_dir/build"
rm -rf "$current_dir/.gradle"
mv "$current_dir/app/src/main/java/com/example" "$current_dir"
mv "$current_dir/app/src/main/res/layout" "$current_dir"
cd "$current_dir"
shopt -s extglob
rm -rf !(example|layout|values)
echo "Cleanup completed!"
