package com.genbuilder.project.GenBuilder.Service.impl;

import com.genbuilder.project.GenBuilder.Service.FileService;
import com.genbuilder.project.GenBuilder.dto.Project.FileContentResponse;
import com.genbuilder.project.GenBuilder.dto.Project.FileNode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {


    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}
